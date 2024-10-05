@echo off
cd NumFun
prompt Please wait Program is starting !
cls
Type README.txt
@echo off
java --module-path "C:\Program Files\Java\javafx-sdk-20.0.2\lib" --add-modules javafx.swing,javafx.media,javafx.controls Main
