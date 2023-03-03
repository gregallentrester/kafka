package net.greg.examples.salient;

import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/kafka")
public class KafkaSimpleController {

  private KafkaTemplate<String, SimpleModel> kafkaTemplate;
  private Gson jsonConverter;

  @Autowired
  public KafkaSimpleController(KafkaTemplate<String, SimpleModel> template) {
    kafkaTemplate = template;
  }

  @PostMapping
  public void post(@RequestBody SimpleModel simpleModel) {
    kafkaTemplate.send("myTopic", simpleModel);
  }

  @KafkaListener(topics = "myTopic")
  public void getFromKafka(SimpleModel simpleModel) {

    System.err.println(simpleModel.toString());
  }
}
