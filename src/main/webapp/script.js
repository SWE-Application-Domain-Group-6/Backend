function sendMail(params){
    var tempParams={
    from_name:document.getElementById("fromName").value,
    to_name:document.getElementById("toName").value,
    message:document.getElementById("msg").value,
        };

    emailjs.send('service_bjw2a15','template_tpxvqxa',tempParams)
    .then(function(res){
          alert('Email sent!');
    console.log("success",res.status);
    })
    }