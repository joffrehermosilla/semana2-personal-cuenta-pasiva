package nttdata.bootcamp.microservicios.personal.cuentapasiva.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import nttdata.bootcamp.microservicios.personal.cuentapasiva.documents.NaturalClientHasPasiveAccount;

@Repository
public interface NaturalClientHasPasiveAccountRepository
		extends ReactiveMongoRepository<NaturalClientHasPasiveAccount, String> {

}
