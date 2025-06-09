#!/bin/bash
echo "Вас приветствует программа установки аутизма на ващ компьютер"
mvn clean package
rm -rf /usr/local/bin/birthday
rm -f /home/$SUDO_USER/.birthday_autism.conf
rm -f /home/$SUDO_USER/.config/autostart/birthday.desktop
echo "создание директории и перенос файлов для аутизма"
mkdir /usr/local/bin/birthday
cp ./target/birthday-0.1-SNAPSHOT.jar /usr/local/bin/birthday/birthday-0.1-SNAPSHOT.jar
cp ./birthday_autism.sh /usr/local/bin/birthday/birthday_autism.sh
chmod +x /usr/local/bin/birthday/birthday_autism.sh
chmod +x /usr/local/bin/birthday/birthday-0.1-SNAPSHOT.jar
echo "введите ваш МЕСЯЦ рождения ЦИФРАМИ например 01 для января"
read MONTH
echo "введите ваш ДЕНЬ рождения ЦИФРАМИ например 04 для четвёртого числа"
read NUMBER
echo $SUDO_USER
touch /home/$SUDO_USER/.birthday_autism.conf
echo "$MONTH-$NUMBER" >> /home/$SUDO_USER/.birthday_autism.conf
echo "данные записаны, создание автозапуска аутизма"

cat > "/home/$SUDO_USER/.config/autostart/birthday.desktop" <<EOF
[Desktop Entry]
Type=Application
Name=Birthday App
Exec=/usr/local/bin/birthday/birthday_autism.sh
Terminal=false
EOF
chmod +x /home/$SUDO_USER/.config/autostart/birthday.desktop
echo "Аутизм создан"