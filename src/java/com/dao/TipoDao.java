package com.dao;



import com.dao.antigo.JPAUtil;
import com.model.Tipo;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;


@Named
@RequestScoped
public class TipoDao implements Serializable{

    public TipoDao() {
    }
    
//    @Inject private JPAFactory jpaFactory;
    
    public void adiciona(Tipo tipo) {

        // consegue a entity manager
//        EntityManager em = jpaFactory.getEntityManager();
        EntityManager em = new JPAUtil().getEntityManager();
        // abre transacao
        em.getTransaction().begin();

        // persiste o objeto
        em.persist(tipo);

        // commita a transacao
        em.getTransaction().commit();

        // fecha a entity manager
        em.close();
    }
    public List<Tipo> listaTodos() {
        try {

//            System.out.println("Entrando no inject");
//            EntityManager em = jpaFactory.getEntityManager();
            EntityManager em = new JPAUtil().getEntityManager();
//            System.out.println("Abrindo Criteria");
            CriteriaQuery<Tipo> query = em.getCriteriaBuilder().createQuery(Tipo.class);
            query.select(query.from(Tipo.class));
//            System.out.println("Trabalhando Lista");
            List<Tipo> lista = em.createQuery(query).getResultList();
//            System.out.println("Fechando EM");
            em.close();
//            System.out.println("Retornando Lista");
            return lista;
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            System.out.println("ERRO:" + e);
            return null;
        }

    }
}