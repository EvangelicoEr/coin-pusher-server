package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "t_marquee")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TMarquee {
    @Id
    private Integer id;

    /**
     * 播放场景 多个逗号分隔。 0为全部场景
     */
    @Column(name = "play_scene")
    private String playScene;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 推送平台 0全部，1安卓，2ios
     */
    @Column(name = "open_platform")
    private Integer openPlatform;

    /**
     * 跳转链接
     */
    private String link;

    /**
     * 操作账号
     */
    @Column(name = "op_account")
    private String opAccount;

    /**
     * 间隔秒
     */
    @Column(name = "interval_sec")
    private Integer intervalSec;

    /**
     * 发送次数
     */
    @Column(name = "send_cnt")
    private Integer sendCnt;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**
     * 通知用户 0所有用户
     */
    @Column(name = "notify_users")
    private String notifyUsers;
}