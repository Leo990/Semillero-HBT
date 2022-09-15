import { TestBed } from '@angular/core/testing';

import { GestionarCompraComicsService } from './gestionar-compra-comics.service';

describe('GestionarCompraComicsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GestionarCompraComicsService = TestBed.get(GestionarCompraComicsService);
    expect(service).toBeTruthy();
  });
});
