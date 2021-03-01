package com.tangem.commands.common.card;

import java.lang.System;

/**
 * Holds information about card firmware version included version saved on card `version`,
 * splitted to `major`, `minor` and `hotFix` and `FirmwareType`
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002R\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001c"}, d2 = {"Lcom/tangem/commands/common/card/FirmwareVersion;", "", "version", "", "(Ljava/lang/String;)V", "major", "", "minor", "hotFix", "type", "Lcom/tangem/commands/common/card/FirmwareType;", "(IIILcom/tangem/commands/common/card/FirmwareType;)V", "<set-?>", "getHotFix", "()I", "getMajor", "getMinor", "getType", "()Lcom/tangem/commands/common/card/FirmwareType;", "getVersion", "()Ljava/lang/String;", "versionDouble", "", "getVersionDouble", "()D", "compareTo", "other", "Companion", "tangem-core"})
public final class FirmwareVersion implements java.lang.Comparable<com.tangem.commands.common.card.FirmwareVersion> {
    private int major = 0;
    private int minor = 0;
    private int hotFix = 0;
    @org.jetbrains.annotations.Nullable()
    private com.tangem.commands.common.card.FirmwareType type;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.tangem.commands.common.card.FirmwareVersion zero = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.tangem.commands.common.card.FirmwareVersion max = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tangem.commands.common.card.FirmwareVersion.Companion Companion = null;
    
    public final int getMajor() {
        return 0;
    }
    
    public final int getMinor() {
        return 0;
    }
    
    public final int getHotFix() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.commands.common.card.FirmwareType getType() {
        return null;
    }
    
    public final double getVersionDouble() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.card.FirmwareVersion other) {
        return 0;
    }
    
    public FirmwareVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        super();
    }
    
    public FirmwareVersion(int major, int minor, int hotFix, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.card.FirmwareType type) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/tangem/commands/common/card/FirmwareVersion$Companion;", "", "()V", "max", "Lcom/tangem/commands/common/card/FirmwareVersion;", "getMax", "()Lcom/tangem/commands/common/card/FirmwareVersion;", "zero", "getZero", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.common.card.FirmwareVersion getZero() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.common.card.FirmwareVersion getMax() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}