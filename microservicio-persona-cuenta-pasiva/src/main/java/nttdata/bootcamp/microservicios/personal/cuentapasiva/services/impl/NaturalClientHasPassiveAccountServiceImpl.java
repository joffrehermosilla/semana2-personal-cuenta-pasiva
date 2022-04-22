package nttdata.bootcamp.microservicios.personal.cuentapasiva.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.bootcamp.microservicios.personal.cuentapasiva.documents.NaturalClientHasPasiveAccount;
import nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients.CurrentAccountFeignClient;
import nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients.FixedTermAccountFeignClient;
import nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients.NaturalClientFeignClient;
import nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients.PassiveSavingFeignClient;
import nttdata.bootcamp.microservicios.personal.cuentapasiva.feignclients.personalActiveAccountFeignClient;
import nttdata.bootcamp.microservicios.personal.cuentapasiva.services.NaturalClientHasPassiveAccountService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NaturalClientHasPassiveAccountServiceImpl implements NaturalClientHasPassiveAccountService {
	private static final Logger LOGGER = LoggerFactory.getLogger(NaturalClientHasPassiveAccountServiceImpl.class);

	@Autowired
	private CurrentAccountFeignClient currentAccountclient;

	@Autowired
	private FixedTermAccountFeignClient fixedTermAccountclient;

	@Autowired
	private NaturalClientFeignClient naturalclient;

	@Autowired
	private PassiveSavingFeignClient passiveSavingclient;

	@Autowired
	private personalActiveAccountFeignClient personalActiveclient;
	
	

	@Override
	public Mono<NaturalClientHasPasiveAccount> findById(String id) {

		return null;
	}

	@Override
	public Flux<NaturalClientHasPasiveAccount> findAlls() {

		return null;
	}

	@Override
	public Mono<NaturalClientHasPasiveAccount> saves(NaturalClientHasPasiveAccount document) {

		return null;
	}

	@Override
	public Mono<Void> delete(NaturalClientHasPasiveAccount document) {

		return null;
	}

}
