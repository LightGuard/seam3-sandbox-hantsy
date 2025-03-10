package org.jboss.seam.forge.persistence;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.jboss.seam.persistence.FlushModeManager;
import org.jboss.seam.persistence.FlushModeType;
import org.jboss.solder.core.ExtensionManaged;


public class DatasourceProducer implements Serializable {
	private static final long serialVersionUID = -5267593171036179836L;

	@SuppressWarnings("unused")
	@PersistenceUnit
	@Produces
	@ConversationScoped
	@ExtensionManaged()
	private EntityManagerFactory emf;

	/*public void close(@Disposes EntityManagerFactory emf) {
		emf.close();
	}*/
}
