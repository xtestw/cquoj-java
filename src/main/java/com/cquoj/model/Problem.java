package com.cquoj.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xuwei on 5/4/16.
 */
@Table(name="problem")
@Entity
public class Problem {
    private int pid;

    @Id
    @javax.persistence.Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    private String input;

    @Basic
    @javax.persistence.Column(name = "input")
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    private String output;

    @Basic
    @javax.persistence.Column(name = "output")
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    private String sampleIn;

    @Basic
    @javax.persistence.Column(name = "sample_in")
    public String getSampleIn() {
        return sampleIn;
    }

    public void setSampleIn(String sampleIn) {
        this.sampleIn = sampleIn;
    }

    private String sampleOut;

    @Basic
    @javax.persistence.Column(name = "sample_out")
    public String getSampleOut() {
        return sampleOut;
    }

    public void setSampleOut(String sampleOut) {
        this.sampleOut = sampleOut;
    }

    private int numberOfTestcase;

    @Basic
    @javax.persistence.Column(name = "number_of_testcase")
    public int getNumberOfTestcase() {
        return numberOfTestcase;
    }

    public void setNumberOfTestcase(int numberOfTestcase) {
        this.numberOfTestcase = numberOfTestcase;
    }

    private int totalSubmit;

    @Basic
    @javax.persistence.Column(name = "total_submit")
    public int getTotalSubmit() {
        return totalSubmit;
    }

    public void setTotalSubmit(int totalSubmit) {
        this.totalSubmit = totalSubmit;
    }

    private int totalAc;

    @Basic
    @javax.persistence.Column(name = "total_ac")
    public int getTotalAc() {
        return totalAc;
    }

    public void setTotalAc(int totalAc) {
        this.totalAc = totalAc;
    }

    private int totalWa;

    @Basic
    @javax.persistence.Column(name = "total_wa")
    public int getTotalWa() {
        return totalWa;
    }

    public void setTotalWa(int totalWa) {
        this.totalWa = totalWa;
    }

    private int totalRe;

    @Basic
    @javax.persistence.Column(name = "total_re")
    public int getTotalRe() {
        return totalRe;
    }

    public void setTotalRe(int totalRe) {
        this.totalRe = totalRe;
    }

    private int totalCe;

    @Basic
    @javax.persistence.Column(name = "total_ce")
    public int getTotalCe() {
        return totalCe;
    }

    public void setTotalCe(int totalCe) {
        this.totalCe = totalCe;
    }

    private int totalTle;

    @Basic
    @javax.persistence.Column(name = "total_tle")
    public int getTotalTle() {
        return totalTle;
    }

    public void setTotalTle(int totalTle) {
        this.totalTle = totalTle;
    }

    private int totalMle;

    @Basic
    @javax.persistence.Column(name = "total_mle")
    public int getTotalMle() {
        return totalMle;
    }

    public void setTotalMle(int totalMle) {
        this.totalMle = totalMle;
    }

    private int totalPe;

    @Basic
    @javax.persistence.Column(name = "total_pe")
    public int getTotalPe() {
        return totalPe;
    }

    public void setTotalPe(int totalPe) {
        this.totalPe = totalPe;
    }

    private int totalOle;

    @Basic
    @javax.persistence.Column(name = "total_ole")
    public int getTotalOle() {
        return totalOle;
    }

    public void setTotalOle(int totalOle) {
        this.totalOle = totalOle;
    }

    private int totalRf;

    @Basic
    @javax.persistence.Column(name = "total_rf")
    public int getTotalRf() {
        return totalRf;
    }

    public void setTotalRf(int totalRf) {
        this.totalRf = totalRf;
    }

    private short specialJudgeStatus;

    @Basic
    @javax.persistence.Column(name = "special_judge_status")
    public short getSpecialJudgeStatus() {
        return specialJudgeStatus;
    }

    public void setSpecialJudgeStatus(short specialJudgeStatus) {
        this.specialJudgeStatus = specialJudgeStatus;
    }

    private int basicSolverValue;

    @Basic
    @javax.persistence.Column(name = "basic_solver_value")
    public int getBasicSolverValue() {
        return basicSolverValue;
    }

    public void setBasicSolverValue(int basicSolverValue) {
        this.basicSolverValue = basicSolverValue;
    }

    private int acValue;

    @Basic
    @javax.persistence.Column(name = "ac_value")
    public int getAcValue() {
        return acValue;
    }

    public void setAcValue(int acValue) {
        this.acValue = acValue;
    }

    private int timeLimit;

    @Basic
    @javax.persistence.Column(name = "time_limit")
    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    private int caseTimeLimit;

    @Basic
    @javax.persistence.Column(name = "case_time_limit")
    public int getCaseTimeLimit() {
        return caseTimeLimit;
    }

    public void setCaseTimeLimit(int caseTimeLimit) {
        this.caseTimeLimit = caseTimeLimit;
    }

    private int memoryLimit;

    @Basic
    @javax.persistence.Column(name = "memory_limit")
    public int getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(int memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    private String hint;

    @Basic
    @javax.persistence.Column(name = "hint")
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    private String source;

    @Basic
    @javax.persistence.Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    private String author;

    @Basic
    @javax.persistence.Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private byte hide;

    @Basic
    @javax.persistence.Column(name = "hide")
    public byte getHide() {
        return hide;
    }

    public void setHide(byte hide) {
        this.hide = hide;
    }

    private String vid;

    @Basic
    @javax.persistence.Column(name = "vid")
    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    private String vname;

    @Basic
    @javax.persistence.Column(name = "vname")
    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    private byte isvirtual;

    @Basic
    @javax.persistence.Column(name = "isvirtual")
    public byte getIsvirtual() {
        return isvirtual;
    }

    public void setIsvirtual(byte isvirtual) {
        this.isvirtual = isvirtual;
    }

    private int vacnum;

    @Basic
    @javax.persistence.Column(name = "vacnum")
    public int getVacnum() {
        return vacnum;
    }

    public void setVacnum(int vacnum) {
        this.vacnum = vacnum;
    }

    private int vtotalnum;

    @Basic
    @javax.persistence.Column(name = "vtotalnum")
    public int getVtotalnum() {
        return vtotalnum;
    }

    public void setVtotalnum(int vtotalnum) {
        this.vtotalnum = vtotalnum;
    }

    private byte ignoreNoc;

    @Basic
    @javax.persistence.Column(name = "ignore_noc")
    public byte getIgnoreNoc() {
        return ignoreNoc;
    }

    public void setIgnoreNoc(byte ignoreNoc) {
        this.ignoreNoc = ignoreNoc;
    }

    private int vacpnum;

    @Basic
    @javax.persistence.Column(name = "vacpnum")
    public int getVacpnum() {
        return vacpnum;
    }

    public void setVacpnum(int vacpnum) {
        this.vacpnum = vacpnum;
    }

    private int vtotalpnum;

    @Basic
    @javax.persistence.Column(name = "vtotalpnum")
    public int getVtotalpnum() {
        return vtotalpnum;
    }

    public void setVtotalpnum(int vtotalpnum) {
        this.vtotalpnum = vtotalpnum;
    }

    private byte isInteractive;

    @Basic
    @javax.persistence.Column(name = "is_interactive")
    public byte getIsInteractive() {
        return isInteractive;
    }

    public void setIsInteractive(byte isInteractive) {
        this.isInteractive = isInteractive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        if (pid != problem.pid) return false;
        if (numberOfTestcase != problem.numberOfTestcase) return false;
        if (totalSubmit != problem.totalSubmit) return false;
        if (totalAc != problem.totalAc) return false;
        if (totalWa != problem.totalWa) return false;
        if (totalRe != problem.totalRe) return false;
        if (totalCe != problem.totalCe) return false;
        if (totalTle != problem.totalTle) return false;
        if (totalMle != problem.totalMle) return false;
        if (totalPe != problem.totalPe) return false;
        if (totalOle != problem.totalOle) return false;
        if (totalRf != problem.totalRf) return false;
        if (specialJudgeStatus != problem.specialJudgeStatus) return false;
        if (basicSolverValue != problem.basicSolverValue) return false;
        if (acValue != problem.acValue) return false;
        if (timeLimit != problem.timeLimit) return false;
        if (caseTimeLimit != problem.caseTimeLimit) return false;
        if (memoryLimit != problem.memoryLimit) return false;
        if (hide != problem.hide) return false;
        if (isvirtual != problem.isvirtual) return false;
        if (vacnum != problem.vacnum) return false;
        if (vtotalnum != problem.vtotalnum) return false;
        if (ignoreNoc != problem.ignoreNoc) return false;
        if (vacpnum != problem.vacpnum) return false;
        if (vtotalpnum != problem.vtotalpnum) return false;
        if (isInteractive != problem.isInteractive) return false;
        if (title != null ? !title.equals(problem.title) : problem.title != null) return false;
        if (description != null ? !description.equals(problem.description) : problem.description != null) return false;
        if (input != null ? !input.equals(problem.input) : problem.input != null) return false;
        if (output != null ? !output.equals(problem.output) : problem.output != null) return false;
        if (sampleIn != null ? !sampleIn.equals(problem.sampleIn) : problem.sampleIn != null) return false;
        if (sampleOut != null ? !sampleOut.equals(problem.sampleOut) : problem.sampleOut != null) return false;
        if (hint != null ? !hint.equals(problem.hint) : problem.hint != null) return false;
        if (source != null ? !source.equals(problem.source) : problem.source != null) return false;
        if (author != null ? !author.equals(problem.author) : problem.author != null) return false;
        if (vid != null ? !vid.equals(problem.vid) : problem.vid != null) return false;
        if (vname != null ? !vname.equals(problem.vname) : problem.vname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (input != null ? input.hashCode() : 0);
        result = 31 * result + (output != null ? output.hashCode() : 0);
        result = 31 * result + (sampleIn != null ? sampleIn.hashCode() : 0);
        result = 31 * result + (sampleOut != null ? sampleOut.hashCode() : 0);
        result = 31 * result + numberOfTestcase;
        result = 31 * result + totalSubmit;
        result = 31 * result + totalAc;
        result = 31 * result + totalWa;
        result = 31 * result + totalRe;
        result = 31 * result + totalCe;
        result = 31 * result + totalTle;
        result = 31 * result + totalMle;
        result = 31 * result + totalPe;
        result = 31 * result + totalOle;
        result = 31 * result + totalRf;
        result = 31 * result + (int) specialJudgeStatus;
        result = 31 * result + basicSolverValue;
        result = 31 * result + acValue;
        result = 31 * result + timeLimit;
        result = 31 * result + caseTimeLimit;
        result = 31 * result + memoryLimit;
        result = 31 * result + (hint != null ? hint.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (int) hide;
        result = 31 * result + (vid != null ? vid.hashCode() : 0);
        result = 31 * result + (vname != null ? vname.hashCode() : 0);
        result = 31 * result + (int) isvirtual;
        result = 31 * result + vacnum;
        result = 31 * result + vtotalnum;
        result = 31 * result + (int) ignoreNoc;
        result = 31 * result + vacpnum;
        result = 31 * result + vtotalpnum;
        result = 31 * result + (int) isInteractive;
        return result;
    }
}
