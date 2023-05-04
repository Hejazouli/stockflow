package ma.ac.emi.ginf.stockflow.handlers;

import lombok.*;
import ma.ac.emi.ginf.stockflow.exceptions.ErrorCodes;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {
    private  Integer httpCode;

    private ErrorCodes code;

    private String message;

    private List<String> errors=new ArrayList<>();
}
