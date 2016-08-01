/*
package fleet.clientreport.bean;

import fleet.clientreport.dao.ClientReportDaoI;

import fleet.ticket.model.Ticket;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

*/
/**
 * Created by sammy on 7/31/16.
 *//*


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
    public class ClientReportBean implements ClientReportBeanI{

        @PersistenceContext
        private EntityManager em;

        @Inject
        private ClientReportDaoI clientReportDao;
   ;

        @PostConstruct
        private void init(){
            clientReportDao.setEm(em);
        }

        public void add(Ticket ticket){
            if(ticket == null || ticket.getTitle() == null)
                return;

            ticket = clientReportDao.add(ticket);
        }


    }
*/
