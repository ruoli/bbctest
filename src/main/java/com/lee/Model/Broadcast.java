package com.lee.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "broad_casts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Broadcast {
    @Id
    @Column(name = "pid", nullable = false)
    private String pid;

    @Column(name = "is_repeat", nullable = false)
    private Boolean is_repeat;

    @Column(name = "is_blanked", nullable = false)
    private Boolean is_blanked;

    @Column(name = "start", nullable = false)
    private String start;

    @Column(name = "end", nullable = false)
    private String end;

    @Column(name = "duration", nullable = false)
    private String duration;

    @OneToOne(mappedBy = "broadcast",cascade={CascadeType.ALL})
    private Programme programme;


    public Boolean getIs_repeat() {
        return is_repeat;
    }

    public void setIs_repeat(Boolean is_repeat) {
        this.is_repeat = is_repeat;
    }

    public Boolean getIs_blanked() {
        return is_blanked;
    }

    public void setIs_blanked(Boolean is_blanked) {
        this.is_blanked = is_blanked;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
}
