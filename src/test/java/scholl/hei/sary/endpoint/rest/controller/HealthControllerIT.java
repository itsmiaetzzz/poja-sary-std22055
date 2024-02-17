package scholl.hei.sary.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static scholl.hei.sary.endpoint.rest.controller.health.PingController.OK;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import scholl.hei.sary.PojaGenerated;
import scholl.hei.sary.conf.FacadeIT;
import scholl.hei.sary.endpoint.rest.controller.health.HealthDbController;
import scholl.hei.sary.endpoint.rest.controller.health.PingController;

@PojaGenerated
class HealthControllerIT extends FacadeIT {

  @Autowired PingController pingController;
  @Autowired HealthDbController healthDbController;

  @Test
  void ping() {
    assertEquals("pong", pingController.ping());
  }

  @Test
  void can_read_from_dummy_table() {
    var responseEntity = healthDbController.dummyTable_should_not_be_empty();
    assertEquals(OK, responseEntity);
  }
}
