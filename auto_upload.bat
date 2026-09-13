@echo off
title Eclipse to GitHub Auto-Sync
echo =======================================================
echo   GitHub Auto-Sync Running... Do not close this window!
echo =======================================================
:loop
git add .
git commit -m "Auto-save update: %date% %time%"
git push origin main
echo.
echo [OK] Code synced successfully at %time%. Next sync in 30 seconds...
echo -------------------------------------------------------
timeout /t 30 /nobreak > nul
goto loop