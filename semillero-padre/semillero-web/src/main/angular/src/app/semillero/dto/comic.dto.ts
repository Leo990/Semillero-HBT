import { EstadoEnum } from "../componentes/crear-persona/enums/estado.enum";
import { TematicaEnum } from "../componentes/crear-persona/enums/tematica.enum";
import { ResultadoDTO } from "./resultado-dto";

export class ComicDTO extends ResultadoDTO{

    public id : number;
	
	public nombre : string;
	
	public editorial : string;
	
	public tematicaEnum : string;
	
	public coleccion : string;
	
	public numeroPaginas : number;
	
	public precio : number;
	
	public autores : string;

	public color : boolean;
	
	public fechaVenta : Date;
	
	public estadoEnum : EstadoEnum;
	
	public cantidad : number;

    constructor() {
        super();
    }
}