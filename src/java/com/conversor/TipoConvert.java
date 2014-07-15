package com.conversor;


import com.dao.antigo.DAO;
import com.model.Tipo;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Tipo.class)
public class TipoConvert implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Tipo cat;
        try{
//            System.out.println("to obj: "+value);
            cat = new DAO<>(Tipo.class).buscaPorId(Long.parseLong(value));
        } catch (Exception e) {
            e.printStackTrace();
            throw new ConverterException(new FacesMessage("Erro ao converter Categoria com id " + value));
        }
        return cat;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Tipo cat = (Tipo) value;
//        System.out.println(cat.getId());
        return cat.getId()+"";
    }
    
    
    
}
