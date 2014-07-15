package com.conversor;


import com.dao.antigo.DAO;
import com.model.Finalidade;
import com.model.Tipo;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Finalidade.class)
public class FinalidadeConvert implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Finalidade cat;
        try{
//            System.out.println("to obj: "+value);
            cat = new DAO<>(Finalidade.class).buscaPorId(Long.parseLong(value));
        } catch (Exception e) {
            e.printStackTrace();
            throw new ConverterException(new FacesMessage("Erro ao converter Categoria com id " + value));
        }
        return cat;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Finalidade cat = (Finalidade) value;
//        System.out.println(cat.getId());
        return cat.getId()+"";
    }
    
    
    
}
