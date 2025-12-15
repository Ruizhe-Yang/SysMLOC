@echo off
SET PATH=;F:/OpenModelica1.25.5-64bit/bin/;%PATH%;
SET ERRORLEVEL=
CALL "%CD%/BouncingBall_res.exe" %*
SET RESULT=%ERRORLEVEL%

EXIT /b %RESULT%
