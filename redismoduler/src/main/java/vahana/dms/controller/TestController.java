package vahana.dms.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vahana.dms.domain.ObjectTransaction;
import vahana.dms.service.ObjectTransactionService;

import java.io.IOException;

@RestController
public class TestController {


    @Autowired
    ObjectTransactionService objectTransactionService;

    @Autowired
    ObjectMapper mapper;

    @GetMapping("/test")
    public Object add() throws IOException {

        ObjectTransaction objectTransaction=new ObjectTransaction();
        objectTransaction.setOrgId("KOTAK");
        objectTransaction.setAppId("KOTAK_APP");
        objectTransaction.setObjectConfigId("sjkd9sks9-wjkej93-sjsj9o2-iwii239");
        objectTransaction.setObjectGroupId("group1");
        objectTransaction.setObjectSubGroupId("sb_group1");
        objectTransaction.setTransId("90d90sw90-sdsi9w0-sdiosio92-sdioisod");
        objectTransaction.setObjectVersion("v1");
        objectTransaction.setBucketId("TEST");

        return objectTransactionService.add(objectTransaction);
    }
}
