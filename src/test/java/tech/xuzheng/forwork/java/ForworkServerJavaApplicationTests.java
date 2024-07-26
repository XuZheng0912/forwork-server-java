package tech.xuzheng.forwork.java;

import org.babyfish.jimmer.sql.JSqlClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.xuzheng.forwork.java.domain.entity.Objects;
import tech.xuzheng.forwork.java.domain.entity.UserInfoTable;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class ForworkServerJavaApplicationTests {

    @Autowired
    private JSqlClient sqlClient;

    @Test
    void contextLoads() {
        UserInfoTable table = UserInfoTable.$;
        List<String> names1 = sqlClient.createQuery(table)
                .where(table.userId().eq(1L))
                .select(table.userName())
                .execute();
        System.out.println(names1);
        sqlClient.save(Objects.createUserInfo(draft -> {
            draft.setUserId(1);
            draft.setUserName("xuzheng");
            draft.setPassword("xz010912");
            draft.setCreateTime(LocalDateTime.now());
            draft.setUpdateTime(LocalDateTime.now());
        }));
        List<String> names2 = sqlClient.createQuery(table)
                .where(table.userId().eq(1L))
                .select(table.userName())
                .execute();
        System.out.println(names2);
    }

}
