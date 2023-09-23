//network call.js
/*
    Network talk
    HTTP/HTTPS
    Async Call, Promise
    a)then b)catch
*/  
//makeNetworkCall("https://gist.githubusercontent.com/kshirsagarps/36fade16fa39202715656ef487aaf7b0/raw/2b682e589ef283f06be42d2799dfa54f57794a6e/Pizza.json");                                                                        
//export 
async function makeNetworkCall(URL){
    try{
    const response = await fetch(URL);
    const data = await response.json();
    console.log ("Data is",data);
    return data;
    }
    catch(err){
        console.log("Error");
        throw err;
    }
  
}
export default makeNetworkCall;
  /*
    const promise = fetch(URL); //ES6 (2015) 
    promise.then((response)=>{
        //header + body
        const promise2 = response.json();
        promise2.then(data=>{
        
        }).catch(err=>{
    
        })
    }).catch((err)=>{
    
    });*/
    //return undefined if await is not used 


