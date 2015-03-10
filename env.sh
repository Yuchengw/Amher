#!/bin/bash
#
#Source this file in your termial to get a working env set up for you
#
#@copy Amher.inc
####

##Check that user is set

WARNING="****************WARNING*************"



if [ -z "${USER:-}" ]; then
	export USER=$(whoami)
	echo "$WARING"
	echo "Environment variable USER was not set, Set to $USER using whoami"
fi

function set_amher_ENV () {
	export AMHER_HOME="$1"
	export WEB_HOME="$AMHER_HOME/web"
	export WEB_TOOLS_HOME="$WEB_HOME/tools"
	export WEB_JDK_HOME="$WEB_TOOLS_HOME/jdk"
	#TODO: select the correct jdk home according to the os version
<<<<<<< HEAD
	export JAVA_HOME="$WEB_JDK_HOME/Linux/$2/"
	export PATH="$1:$JAVA_HOME/bin:$PATH"
=======
	export JAVA_HOME="$WEB_JDK_HOME/Linux/$2"
	export PATH="$1:$JAVA_HOME/bin"
>>>>>>> 23cf9d51cba05f914d5e89b73c1219c86f6862d8

	if [ "$OSTYPE" == Darwin ]; then
		export JAVA_HOME="$WEB_JDK_HOME/Mac/$2"
	fi
}

set_amher_ENV $HOME/Amher jdk1.7.0_80