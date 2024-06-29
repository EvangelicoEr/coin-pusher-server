package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "t_user_machine_feedback")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TUserMachineFeedback {
    @Id
    private Long id;

    /**
     * 玩家usercode
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 机器id
     */
    @Column(name = "machine_id")
    private String machineId;

    /**
     * 反馈id
     */
    @Column(name = "feed_back_id")
    private Integer feedBackId;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;
}