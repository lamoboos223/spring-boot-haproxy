## Usage

> docker build -t demo-haproxy .
>
> docker run -d -e SERVER_PORT=8081 -p 8081:8081 demo-haproxy
>
> docker run -d -e SERVER_PORT=8082 -p 8082:8082 demo-haproxy
>
> haproxy -f haproxy.cfg