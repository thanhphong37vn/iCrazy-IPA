mobile = (DetectTierIphone()||DetectTierRichCss()||DetectTierOtherPhones());
support = !!(document.createElement('audio').canPlayType);
if(support){
	method = "html5";
	audio = new Audio("");
	ogg_support = audio.canPlayType("audio/ogg");
	mp3_support = audio.canPlayType("audio/mpeg");
	wav_support = audio.canPlayType("audio/vnd.wave");
	if(ogg_support == "probably")
		type = "ogg";
	else if(mp3_support == "probably")
		type = "mp3";
	else if(wav_support == "probably")
		type = "wav";
	else if(ogg_support == "maybe")
		type = "ogg";
	else if(mp3_support == "maybe")
		type = "mp3";
	else if(wav_support == "maybe")
		type = "wav";
	else if(ogg_support != "no" && ogg_support != "")
		type = "ogg";
	else if(mp3_support != "no" && mp3_support != "")
		type = "mp3";
	else if(wav_support != "no" && wav_support != "")
		type = "wav";
	else {
		type = "mp3";
		support = false;
	}
	if(support) clips=[];
} else {
	support = false;
	type = "mp3";
}
function ipa(sound) {type = "mp3";
	if(support){
		//if(!clips[sound]) clips[sound] = new Audio(type+'/'+sound+'.'+type);
		//clips[sound].play();
		if(!clips[sound]) clips[sound] = new Audio(sound);
		//alert(clips[sound].src);
		Audi.playAudio(clips[sound].src);
	}else{
		if(mobile) {
			window.location = type+'/'+sound+'.'+type;
		} else {
		document.getElementById("object").innerHTML = '<object classid="CLSID:22d6f312-b0f6-11d0-94ab-0080c74c7e95" type="audio/mpeg" data="mp3/'+sound+'.mp3"><param name="src" value="mp3/'+sound+'.mp3"><param name="autoplay" value="true"><param name="autoStart" value="1"><object classid="CLSID:22d6f312-b0f6-11d0-94ab-0080c74c7e95" type="audio/x-wav" data="wav/'+sound+'.wav"><param name="src" value="wav/'+sound+'.wav"><param name="autoplay" value="true"><param name="autoStart" value="1"><script type="text/javascript" language="javascript"><object type="audio/mpeg" data="mp3/'+sound+'.mp3"><param name="src" value="mp3/'+sound+'.mp3"><param name="autoplay" value="true"><param name="autoStart" value="1"><object type="audio/ogg" data="ogg/'+sound+'.ogg"><param name="src" value="ogg/'+sound+'.ogg"><param name="autoplay" value="true"><param name="autoStart" value="1"><object type="audio/x-wav" data="wav/'+sound+'.wav"><param name="src" value="wav/'+sound+'.wav"><param name="autoplay" value="true"><param name="autoStart" value="1"><script type="text/javascript" language="javascript">window.location = type+"/"+sound+"."+type;</scr'+'ipt></object></object></object></object>';
		}
	}
}
function set_type(new_type) {
	type = new_type;
}
