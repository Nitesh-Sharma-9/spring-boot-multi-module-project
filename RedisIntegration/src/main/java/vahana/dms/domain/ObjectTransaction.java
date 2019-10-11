package vahana.dms.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("OBJECT_TRANSACTIONS_HASHING")
public class ObjectTransaction {

    @Id
    private String id;

    private String orgId;

    private String appId;

    private String transId;

    private String bucketId;

    private String objectConfigId;

    private String objectGroupId;

    private String objectSubGroupId;

    private String objectVersion;

    private String objectMetaData;
}
