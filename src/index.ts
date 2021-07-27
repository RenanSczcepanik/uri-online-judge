import express, { Request, Response } from "express";
import logger from "./logger";

const PORT = 8080;
const app = express();

app.get("/hello-world", (req: Request, res: Response) => {
    res.json({
        message: "Hello  gg gg sWorld",
    });
});

app.get("/teste");

app.get("/hello-world/:nome", (req: Request, res: Response) => {
    const { nome } = req.params;
    res.json({
        message: `Olá eita ${nome}!`,
    });
});

app.get("/hello-world/teste/:nome", (req: Request, res: Response) => {
    const { nome } = req.params;
    res.json({
        message: `Olá eita ${nome}!`,
    });
});

app.listen(PORT, () => {
    logger.debug(`Aplicação escutando na porta massa ${PORT}`);
});
