import { TranslateService } from "@ngx-translate/core";

export class MultiLanguage {
        
    constructor( public translate: TranslateService) {
        translate.addLangs(['en', 'es']);
        translate.setDefaultLang('es');
        translate.use('es'); 
      }  
}