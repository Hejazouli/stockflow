package ma.ac.emi.ginf.stockflow.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import ma.ac.emi.ginf.stockflow.model.Adresse;
import ma.ac.emi.ginf.stockflow.model.Client;

import java.util.List;

@Data
@Builder
public class ClientDto {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public  ClientDto fromEntity(Client client){
        if(client == null)
            return  null;
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .email(client.getEmail())
                .build();
    }
    public Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return null;
        }
        Client client=new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setEmail(clientDto.getEmail());
        return  client;
    }
}
