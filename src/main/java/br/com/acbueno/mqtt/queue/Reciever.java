package br.com.acbueno.mqtt.queue;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.reactive.messaging.annotations.Broadcast;

@ApplicationScoped
public class Reciever {

  @Incoming("devices")
  @Outgoing("injection-sensor")
  @Broadcast
  public String process(byte[] data) {
    String raw = new String(data);
    return raw;
  }

}
