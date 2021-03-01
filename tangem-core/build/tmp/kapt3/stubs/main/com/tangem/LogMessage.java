package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/tangem/LogMessage;", "", "duration", "", "getDuration", "()D", "setDuration", "(D)V", "initTime", "", "getInitTime", "()J", "message", "", "getMessage", "()Ljava/lang/String;", "time", "getTime", "setTime", "type", "Lcom/tangem/MessageType;", "getType", "()Lcom/tangem/MessageType;", "tangem-core"})
public abstract interface LogMessage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.tangem.MessageType getType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMessage();
    
    public abstract long getInitTime();
    
    public abstract double getTime();
    
    public abstract void setTime(double p0);
    
    public abstract double getDuration();
    
    public abstract void setDuration(double p0);
}