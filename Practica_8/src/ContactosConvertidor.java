/**
 * Created by carlosb108 on 9/14/16.
 */

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;




@FacesConverter(value = "miConvertidorContactos")
public class ContactosConvertidor implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("Valor Recibido Conversion: " + value);
        if (value == null || value.length() == 0) {
            //error. sin datos.
            System.out.println("Error sin datos..");
            return null;
        }

        if (value.length() != 10 || !value.contains("-")) { //trabajar mejor
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Valor no corresponde con el valor esperado",
                    "EL telefono debe tener la cantidad de 8 numeros");
            //enviando la excepcion.
            throw new ConverterException(facesMessage);
        }

        //Llamada a una base de datos... o interfaz...
        Contactos contactos =new Contactos(value, "Contacto -> " +value);

        return contactos;

    }
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Contactos contactos = (Contactos) value;
        return contactos.getTelefono();
    }


    
}
