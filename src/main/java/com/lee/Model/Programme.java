package com.lee.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "programme")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Programme {
    @OneToOne
    @PrimaryKeyJoinColumn
    private Broadcast broadcast;

    @Id
    @GeneratedValue
    @Column(name="broadcast_id", unique=true, nullable=false)
    private String id;

    @Column(name = "pid", nullable = false)
    private String pid;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "position", nullable = false)
    private int position;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "short_synopsis", nullable = false)
    private String short_synopsis;

    @Column(name = "media_type", nullable = false)
    private String media_type;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "first_broadcast_date", nullable = false)
    private String first_broadcast_date;

    @Column(name = "available_until", nullable = true)
    private String available_until;

    @Column(name = "actual_start", nullable = true)
    private String actual_start;

    @Column(name = "is_available_mediaset_pc_sd", nullable = false)
    private boolean is_available_mediaset_pc_sd;

    @Column(name = "is_legacy_media", nullable = false)
    private boolean is_legacy_media;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShort_synopsis() {
        return short_synopsis;
    }

    public void setShort_synopsis(String short_synopsis) {
        this.short_synopsis = short_synopsis;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFirst_broadcast_date() {
        return first_broadcast_date;
    }

    public void setFirst_broadcast_date(String first_broadcast_date) {
        this.first_broadcast_date = first_broadcast_date;
    }

    public String getAvailable_until() {
        return available_until;
    }

    public void setAvailable_until(String available_until) {
        this.available_until = available_until;
    }

    public String getActual_start() {
        return actual_start;
    }

    public void setActual_start(String actual_start) {
        this.actual_start = actual_start;
    }

    public boolean isIs_available_mediaset_pc_sd() {
        return is_available_mediaset_pc_sd;
    }

    public void setIs_available_mediaset_pc_sd(boolean is_available_mediaset_pc_sd) {
        this.is_available_mediaset_pc_sd = is_available_mediaset_pc_sd;
    }

    public boolean isIs_legacy_media() {
        return is_legacy_media;
    }

    public void setIs_legacy_media(boolean is_legacy_media) {
        this.is_legacy_media = is_legacy_media;
    }

}
