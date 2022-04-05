package br.com.acbueno.mqtt.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.reactivestreams.Publisher;

@Path("/devices")
public class MotorSensorController {

  @Inject
  @Channel("injection-sensor")
  Publisher<String> data;

  @GET
  @Path("stream")
  @Produces(MediaType.SERVER_SENT_EVENTS)
  public Publisher<String> stream(){
    return data;
  }


}