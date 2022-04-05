package br.com.acbueno.mqtt.producer;

import java.util.concurrent.TimeUnit;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.jboss.logging.Logger;

import br.com.acbueno.mqtt.model.InjectionSensor;
import io.reactivex.Flowable;
import io.reactivex.BackpressureStrategy;

@ApplicationScoped
public class InjectionSensorProducer {

  InjectionSensor injectionSensor = new InjectionSensor("boschSfiJectronic");

  @Inject
  Logger log;

  @Outgoing("sensor-device")
  public Flowable<String> generate(){
    return Flowable.interval(2, TimeUnit.SECONDS)
        .onBackpressureDrop()
        .map(s -> {
          String data = injectionSensor.toString();
          log.info(data);
          return data;
        });
  }

}
