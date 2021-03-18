package com.example.fitbit_tracker.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Session {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "uuid")
    private String uuid;

    @ColumnInfo(name = "start_time")
    private long startTime;

    @ColumnInfo(name = "end_time")
    private long endTime;

    @ColumnInfo(name = "device_model")
    private String deviceModel;

    @ColumnInfo(name = "readings_count")
    private int readingsCount;

    private int userId;

    public Session(String uuid, long startTime, long endTime, String deviceModel, int readingsCount) {
        this.uuid = uuid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deviceModel = deviceModel;
        this.readingsCount = readingsCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setReadingsCount(int readingsCount) {
        this.readingsCount = readingsCount;
    }

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public int getReadingsCount() {
        return readingsCount;
    }

    public int getUserId() {
        return userId;
    }
}
