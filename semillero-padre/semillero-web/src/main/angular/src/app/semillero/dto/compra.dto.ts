export class CompraDTO {
    public idComic : number;
    public cantidadComicsAComprar : number;

    constructor (idComic : number, cantidadComicsAComprar : number){
        this.idComic = idComic
        this.cantidadComicsAComprar = cantidadComicsAComprar
    }
}