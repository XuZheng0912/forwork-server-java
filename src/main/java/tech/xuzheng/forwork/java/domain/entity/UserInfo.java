package tech.xuzheng.forwork.java.domain.entity;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.GeneratedValue;
import org.babyfish.jimmer.sql.GenerationType;
import org.babyfish.jimmer.sql.Id;

@Entity
public interface UserInfo extends SystemInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userId();

    String userName();

    String password();
}
