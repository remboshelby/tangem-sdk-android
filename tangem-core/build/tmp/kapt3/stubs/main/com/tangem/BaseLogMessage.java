package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0007H\u0002R\u001a\u0010\b\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/tangem/BaseLogMessage;", "Lcom/tangem/LogMessage;", "type", "Lcom/tangem/MessageType;", "initTime", "", "time", "", "duration", "(Lcom/tangem/MessageType;JDD)V", "getDuration", "()D", "setDuration", "(D)V", "getInitTime", "()J", "getTime", "setTime", "getType", "()Lcom/tangem/MessageType;", "messageAtNewString", "", "toString", "toSeconds", "tangem-core"})
public abstract class BaseLogMessage implements com.tangem.LogMessage {
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.MessageType type = null;
    private final long initTime = 0L;
    private double time;
    private double duration;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private final java.lang.String messageAtNewString() {
        return null;
    }
    
    private final java.lang.String toSeconds(double $this$toSeconds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.MessageType getType() {
        return null;
    }
    
    @java.lang.Override()
    public long getInitTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public double getTime() {
        return 0.0;
    }
    
    @java.lang.Override()
    public void setTime(double p0) {
    }
    
    @java.lang.Override()
    public double getDuration() {
        return 0.0;
    }
    
    @java.lang.Override()
    public void setDuration(double p0) {
    }
    
    public BaseLogMessage(@org.jetbrains.annotations.NotNull()
    com.tangem.MessageType type, long initTime, double time, double duration) {
        super();
    }
}