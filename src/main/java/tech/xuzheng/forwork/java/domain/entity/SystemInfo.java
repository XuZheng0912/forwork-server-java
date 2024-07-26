package tech.xuzheng.forwork.java.domain.entity;

import org.babyfish.jimmer.sql.MappedSuperclass;

import java.time.LocalDateTime;


@MappedSuperclass
public interface SystemInfo {
    LocalDateTime createTime();

    LocalDateTime updateTime();
}
