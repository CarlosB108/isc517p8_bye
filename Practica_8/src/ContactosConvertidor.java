/**
 * Created by carlosb108 on 9/14/16.
 */


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value = "miValidadorContactos")

public class ContactosConvertidor implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        //validando que la matricula no sea menor al 2000
        Contactos contactos = (Contactos) value;
        if(Contactos.getMatricula().startsWith("19")){
            System.out.println("Matricula no valida....");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Matricula debe ser mayor a 2000",
                    "Debe ser una matricual mayor a 2000");
            throw new ValidatorException(facesMessage);
        }
    }














}
