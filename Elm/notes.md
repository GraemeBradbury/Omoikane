There are times when you do not want to change ownership of the default directory that npm uses (i.e. /usr) as this could cause some problems, for example if you are sharing the system with other users.

Instead, you can configure npm to use a different directory altogether. In our case, this will be a hidden directory in our home folder.

Make a directory for global installations:

 mkdir ~/.npm-global
Configure npm to use the new directory path:

 npm config set prefix '~/.npm-global'
Open or create a ~/.profile file and add this line:

 export PATH=~/.npm-global/bin:$PATH
Back on the command line, update your system variables:

 source ~/.profile
Test: Download a package globally without using sudo.

    npm install -g jshint
Instead of steps 2-4 you can also use the corresponding ENV variable (e.g. if you don't want to modify ~/.profile):

    NPM_CONFIG_PREFIX=~/.npm-global