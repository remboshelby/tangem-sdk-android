package com.tangem.common.files;

import java.lang.System;

/**
 * Use this helper when creating signatures for files protected by Issuer's signature
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/tangem/common/files/FileHashHelper;", "", "()V", "Companion", "tangem-core"})
public final class FileHashHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.tangem.common.files.FileHashHelper.Companion Companion = null;
    
    public FileHashHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a8\u0006\f"}, d2 = {"Lcom/tangem/common/files/FileHashHelper$Companion;", "", "()V", "prepareHashes", "Lcom/tangem/common/files/FileHashData;", "cardId", "", "fileData", "", "fileCounter", "", "privateKey", "tangem-core"})
    public static final class Companion {
        
        /**
         * Creates hashes and signatures for [com.tangem.commands.file.FileData.DataProtectedBySignature]
         * @param cardId: CID, Unique Tangem card ID number.
         * @param fileData: File data that will be written on card
         * @param fileCounter: A counter that protects issuer data against replay attack.
         * @param privateKey: Optional private key that will be used for signing files hashes.
         * If it is provided, then [FileHashData] will contain signed file signatures.
         * @return [FileHashData] with hashes to sign and signatures if [privateKey] was provided.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.common.files.FileHashData prepareHashes(@org.jetbrains.annotations.NotNull()
        java.lang.String cardId, @org.jetbrains.annotations.NotNull()
        byte[] fileData, int fileCounter, @org.jetbrains.annotations.Nullable()
        byte[] privateKey) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}