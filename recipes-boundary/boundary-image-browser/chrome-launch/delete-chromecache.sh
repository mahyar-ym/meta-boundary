#!bin/sh
rm /home/root/.config -r \
&& mkdir -p /home/root/.config/chromium/Default/ \
&& cp /usr/bin/chrome/master_preferences /home/root/.config/chromium/Default/Preferences \
&& chmod 444 /home/root/.config/chromium/Default/Preferences \
