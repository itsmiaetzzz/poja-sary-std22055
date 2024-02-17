package scholl.hei.sary.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import scholl.hei.sary.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
