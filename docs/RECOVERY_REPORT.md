# LENSIQ recovered Kotlin project

This archive is a best-effort reconstruction based on the chat context and `deep-research-report.md`.

## Restored domains

- app shell: `LensIqApplication`, `SplashActivity`, `MainActivity`;
- device/control: `BaseBluetoothFragment`, `HomeFragment`, `DeviceController`;
- AI assistant: `AiAssistantFragment`, `AiWebSocketManager`, `AiChatMessage`, `AiChatRepository`, background services;
- media/album: `PhotoListFragment`, `MediaImportCoordinator`, `PreviewActivity`;
- translation: `BaseAsrTransActivity`, `RealTimeTranslationActivity`, `TransChatFreelyActivity`, `TranslationSocketStrategy`;
- profile/settings: `MineFragment`, `LoginActivity`;
- alarm/background: `AlarmService`, `AlarmReceiver`, `DaemonService`.

## Important limitation

This is not a complete byte-for-byte source recovery. The GitHub repositories were not available to the local execution environment, so the ZIP contains the maximum reliable structure and Kotlin code that could be reconstructed from the provided architecture report and accumulated chat context. Business logic that depends on proprietary `com.watchfun.*`, generated binding classes, and heavily obfuscated `p000/defpackage` glue is represented as explicit Kotlin extension points/stubs.

## Next exact step

Put the actual deobfuscated Java files into `docs/original-java/` or upload the repos as ZIP files. Then each class can be converted one-by-one into Kotlin while preserving method-level logic.
