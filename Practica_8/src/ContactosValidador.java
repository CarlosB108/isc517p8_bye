import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by carlosb108 on 9/15/16.
 */

@FacesValidator(value = "miValidadorContactos")
public class ContactosValidador implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Contactos contactos = (Contactos) value;

        if(Contactos.getNombre().isEmpty()){
            System.out.println("Casilla vacia!!!");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe escribir un nombre","Debe escribir un nombre");
            throw new ValidatorException(facesMessage);
        }

        if(Contactos.getApellido().isEmpty()){
            System.out.println("Casilla vacia!!!");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe escribir un apellido","Debe escribir un apellido");
            throw new ValidatorException(facesMessage);
        }
        if(Contactos.getDireccion().isEmpty()){
            System.out.println("Casilla vacia!!!");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe escribir una Direccion","Debe escribir una Direccion");
            throw new ValidatorException(facesMessage);
        }
        if(Contactos.getTelefono().isEmpty()){
            System.out.println("Casilla vacia!!!");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe escribir un telefon","Debe escribir un telefono");
            throw new ValidatorException(facesMessage);
        }

        if(Contactos.getCorreo().isEmpty()){
            System.out.println("Casilla vacia!!!");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe escribir un Correo","Debe escribir un Correo");
            throw new ValidatorException(facesMessage);
        }

    }
}
