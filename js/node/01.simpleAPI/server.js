const http = require("http");

const host = 'localhost';
const port = 8000;

const requestListener = function (req, res) {
	console.log(req.url);
    if(req.url.includes("html")){
	res.setHeader("Content-Type", "text/html");
	res.writeHead(200);
	res.end(`<html><body><h1>Hello world</h1></body></html>`);
    } if (req.url.includes("csv")){
  	res.setHeader("Content-Type", "text/csv");
	res.setHeader("Content-Disposition", "attachment;filename=oceanpals.csv");
	res.writeHead(200);
	res.end(`id,name,email\n1,Leonel,leonel@myemail.com`);
    } else {	    
	res.setHeader("Content-Type", "application/json");
	res.writeHead(200);
	res.end(`{"message": "This is a JSON response"}`);
    }
};

const server = http.createServer(requestListener);
server.listen(port, host, () => {
    console.log(`Server is running on http://${host}:${port}`);
    console.log(`Entry http://${host}:${port}/json`);
    console.log(`Entry http://${host}:${port}/csv`);
    console.log(`Entry http://${host}:${port}/html`);
});
