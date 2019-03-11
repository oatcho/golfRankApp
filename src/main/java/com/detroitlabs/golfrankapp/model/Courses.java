package com.detroitlabs.golfrankapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Courses {
    ArrayList<CourseInfo> resources;

    @JsonProperty("resources")
    public ArrayList<CourseInfo> getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(ArrayList<CourseInfo> resources) {
        this.resources = resources;
    }
}
