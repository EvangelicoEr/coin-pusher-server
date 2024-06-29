package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Table(name = "machine_group")
@ToString
public class MachineGroup {
    /**
     * 分组主键
     */
    @Id
    @Column(name = "group_id")
    private String groupId;

    /**
     * 分组名称
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 分组排序
     */
    @Column(name = "group_order")
    private Integer groupOrder;

    /**
     * 分组logo
     */
    @Column(name = "group_logo")
    private String groupLogo;

    /**
     * 类型 1.机器 2商品（购买商品得到币）
     */
    @Column(name = "group_type")
    private String groupType;

    /**
     * 暴击赠送金币
     */
    @Column(name = "group_give")
    private Integer groupGive;

    /**
     * 卡片类型  1~6 个类型
     */
    @Column(name = "card_type")
    private Integer cardType;

    /**
     * 排行榜是消耗统计还是赢分统计 0消耗统计 1赢分统计
     */
    @Column(name = "rank_type")
    private Integer rankType;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2正常    0关闭
     */
    private String zt;

    /**
     * 备注
     */
    private String bz;

    /**
     * 更新时间
     */
    private String gxsj;

    @Column(name = "channel_ids")
    private String channelIds;

    private Set<String> channelSet;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(Integer groupOrder) {
        this.groupOrder = groupOrder;
    }

    public String getGroupLogo() {
        return groupLogo;
    }

    public void setGroupLogo(String groupLogo) {
        this.groupLogo = groupLogo;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public Integer getGroupGive() {
        return groupGive;
    }

    public void setGroupGive(Integer groupGive) {
        this.groupGive = groupGive;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getLrsj() {
        return lrsj;
    }

    public void setLrsj(String lrsj) {
        this.lrsj = lrsj;
    }

    public String getLrzh() {
        return lrzh;
    }

    public void setLrzh(String lrzh) {
        this.lrzh = lrzh;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public Integer getRankType() {
        return rankType;
    }

    public void setRankType(Integer rankType) {
        this.rankType = rankType;
    }

    public String getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(String channelIds) {
        this.channelIds = channelIds;
        if(StringUtils.isNotBlank(channelIds)) {
            Set<String> _channelSet = new HashSet<>();
            String[] cids = channelIds.split(",");
            for(String cid : cids) {
                _channelSet.add(cid);
            }
            this.channelSet = _channelSet;
        }
    }

    public boolean constainChannel(Integer channelId) {
        if(channelSet == null) return false;
        return channelSet.contains("-1") || channelSet.contains(channelId.toString());
    }
}