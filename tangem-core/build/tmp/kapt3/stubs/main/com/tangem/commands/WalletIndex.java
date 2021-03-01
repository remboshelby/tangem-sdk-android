package com.tangem.commands;

import java.lang.System;

/**
 * Pointer to specific wallet for interaction
 * Currently available two type of pointers: `Index` and `PublicKey`
 * Note: Available for cards with COS v.4.0 and higher
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/commands/WalletIndex;", "", "()V", "Index", "PublicKey", "Lcom/tangem/commands/WalletIndex$Index;", "Lcom/tangem/commands/WalletIndex$PublicKey;", "tangem-core"})
public abstract class WalletIndex {
    
    private WalletIndex() {
        super();
    }
    
    /**
     * Pointer to wallet by index.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/tangem/commands/WalletIndex$Index;", "Lcom/tangem/commands/WalletIndex;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "tangem-core"})
    public static final class Index extends com.tangem.commands.WalletIndex {
        private final int index = 0;
        
        public final int getIndex() {
            return 0;
        }
        
        public Index(int index) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        /**
         * Pointer to wallet by index.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.WalletIndex.Index copy(int index) {
            return null;
        }
        
        /**
         * Pointer to wallet by index.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Pointer to wallet by index.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Pointer to wallet by index.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * Pointer to wallet by wallet public key
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/tangem/commands/WalletIndex$PublicKey;", "Lcom/tangem/commands/WalletIndex;", "data", "", "([B)V", "getData", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tangem-core"})
    public static final class PublicKey extends com.tangem.commands.WalletIndex {
        @org.jetbrains.annotations.NotNull()
        private final byte[] data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getData() {
            return null;
        }
        
        public PublicKey(@org.jetbrains.annotations.NotNull()
        byte[] data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] component1() {
            return null;
        }
        
        /**
         * Pointer to wallet by wallet public key
         */
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.WalletIndex.PublicKey copy(@org.jetbrains.annotations.NotNull()
        byte[] data) {
            return null;
        }
        
        /**
         * Pointer to wallet by wallet public key
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Pointer to wallet by wallet public key
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Pointer to wallet by wallet public key
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}