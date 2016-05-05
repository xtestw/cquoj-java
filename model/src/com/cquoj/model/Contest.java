package com.cquoj.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by xuwei on 5/4/16.
 */

@Table(name="contest")
@Entity
public class Contest {
    private int cid;

    @Id
    @javax.persistence.Column(name = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private byte isprivate;

    @Basic
    @javax.persistence.Column(name = "isprivate")
    public byte getIsprivate() {
        return isprivate;
    }

    public void setIsprivate(byte isprivate) {
        this.isprivate = isprivate;
    }

    private Timestamp startTime;

    @Basic
    @javax.persistence.Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    private Timestamp endTime;

    @Basic
    @javax.persistence.Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    private Timestamp lockBoardTime;

    @Basic
    @javax.persistence.Column(name = "lock_board_time")
    public Timestamp getLockBoardTime() {
        return lockBoardTime;
    }

    public void setLockBoardTime(Timestamp lockBoardTime) {
        this.lockBoardTime = lockBoardTime;
    }

    private byte hideOthers;

    @Basic
    @javax.persistence.Column(name = "hide_others")
    public byte getHideOthers() {
        return hideOthers;
    }

    public void setHideOthers(byte hideOthers) {
        this.hideOthers = hideOthers;
    }

    private Timestamp boardMake;

    @Basic
    @javax.persistence.Column(name = "board_make")
    public Timestamp getBoardMake() {
        return boardMake;
    }

    public void setBoardMake(Timestamp boardMake) {
        this.boardMake = boardMake;
    }

    private short isvirtual;

    @Basic
    @javax.persistence.Column(name = "isvirtual")
    public short getIsvirtual() {
        return isvirtual;
    }

    public void setIsvirtual(short isvirtual) {
        this.isvirtual = isvirtual;
    }

    private String owner;

    @Basic
    @javax.persistence.Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String report;

    @Basic
    @javax.persistence.Column(name = "report")
    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    private Timestamp mboardMake;

    @Basic
    @javax.persistence.Column(name = "mboard_make")
    public Timestamp getMboardMake() {
        return mboardMake;
    }

    public void setMboardMake(Timestamp mboardMake) {
        this.mboardMake = mboardMake;
    }

    private String allp;

    @Basic
    @javax.persistence.Column(name = "allp")
    public String getAllp() {
        return allp;
    }

    public void setAllp(String allp) {
        this.allp = allp;
    }

    private int type;

    @Basic
    @javax.persistence.Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private byte hasCha;

    @Basic
    @javax.persistence.Column(name = "has_cha")
    public byte getHasCha() {
        return hasCha;
    }

    public void setHasCha(byte hasCha) {
        this.hasCha = hasCha;
    }

    private Timestamp challengeEndTime;

    @Basic
    @javax.persistence.Column(name = "challenge_end_time")
    public Timestamp getChallengeEndTime() {
        return challengeEndTime;
    }

    public void setChallengeEndTime(Timestamp challengeEndTime) {
        this.challengeEndTime = challengeEndTime;
    }

    private Timestamp challengeStartTime;

    @Basic
    @javax.persistence.Column(name = "challenge_start_time")
    public Timestamp getChallengeStartTime() {
        return challengeStartTime;
    }

    public void setChallengeStartTime(Timestamp challengeStartTime) {
        this.challengeStartTime = challengeStartTime;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private byte ownerViewable;

    @Basic
    @javax.persistence.Column(name = "owner_viewable")
    public byte getOwnerViewable() {
        return ownerViewable;
    }

    public void setOwnerViewable(byte ownerViewable) {
        this.ownerViewable = ownerViewable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contest contest = (Contest) o;

        if (cid != contest.cid) return false;
        if (isprivate != contest.isprivate) return false;
        if (hideOthers != contest.hideOthers) return false;
        if (isvirtual != contest.isvirtual) return false;
        if (type != contest.type) return false;
        if (hasCha != contest.hasCha) return false;
        if (ownerViewable != contest.ownerViewable) return false;
        if (title != null ? !title.equals(contest.title) : contest.title != null) return false;
        if (description != null ? !description.equals(contest.description) : contest.description != null) return false;
        if (startTime != null ? !startTime.equals(contest.startTime) : contest.startTime != null) return false;
        if (endTime != null ? !endTime.equals(contest.endTime) : contest.endTime != null) return false;
        if (lockBoardTime != null ? !lockBoardTime.equals(contest.lockBoardTime) : contest.lockBoardTime != null)
            return false;
        if (boardMake != null ? !boardMake.equals(contest.boardMake) : contest.boardMake != null) return false;
        if (owner != null ? !owner.equals(contest.owner) : contest.owner != null) return false;
        if (report != null ? !report.equals(contest.report) : contest.report != null) return false;
        if (mboardMake != null ? !mboardMake.equals(contest.mboardMake) : contest.mboardMake != null) return false;
        if (allp != null ? !allp.equals(contest.allp) : contest.allp != null) return false;
        if (challengeEndTime != null ? !challengeEndTime.equals(contest.challengeEndTime) : contest.challengeEndTime != null)
            return false;
        if (challengeStartTime != null ? !challengeStartTime.equals(contest.challengeStartTime) : contest.challengeStartTime != null)
            return false;
        if (password != null ? !password.equals(contest.password) : contest.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) isprivate;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (lockBoardTime != null ? lockBoardTime.hashCode() : 0);
        result = 31 * result + (int) hideOthers;
        result = 31 * result + (boardMake != null ? boardMake.hashCode() : 0);
        result = 31 * result + (int) isvirtual;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (report != null ? report.hashCode() : 0);
        result = 31 * result + (mboardMake != null ? mboardMake.hashCode() : 0);
        result = 31 * result + (allp != null ? allp.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (int) hasCha;
        result = 31 * result + (challengeEndTime != null ? challengeEndTime.hashCode() : 0);
        result = 31 * result + (challengeStartTime != null ? challengeStartTime.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) ownerViewable;
        return result;
    }
}
